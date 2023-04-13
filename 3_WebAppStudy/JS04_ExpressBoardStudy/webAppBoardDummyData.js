const faker = require('faker'); //npm i -D faker@5  개발자가 최신버전에 오류를 배포해서 동작하지 않음 구버전 사용
const mysql2 = require('mysql2');

const connection = mysql2.createPool({
    host: 'localhost',
    post: 3306,
    user: 'boardDba',
    password: 'mysql123',
    database: 'webAppBoard'
});

const mysql=connection.promise();

// users table
for (let i = 0; i < 100; i++) {
    const u_id = faker.internet.userName();
    const pw = faker.internet.password();
    const name = faker.name.findName();
    const phone = faker.phone.phoneNumber('010-####-####');
    const img_path = faker.image.avatar();
    const email = faker.internet.email();
    const post_time = faker.date.past().toISOString().slice(0, 19).replace('T', ' ');
    const birth = faker.date.between('1950-01-01', '2003-03-01').toISOString().slice(0, 10);
    const gender = faker.random.arrayElement(['FEMALE', 'MALE', 'NONE']);
    const address = faker.address.city();
    const detail_address = faker.address.streetAddress();
    const permission = faker.random.arrayElement(['ADMIN', 'USER', 'SILVER', 'GOLD', 'PRIVATE']);

    const query = `
    INSERT INTO users (u_id, pw, name, phone, img_path, email, post_time, birth, gender, address, detail_address, permission) 
    VALUES ('${u_id}', '${pw}', '${name}', '${phone}', '${img_path}', '${email}', '${post_time}', '${birth}', '${gender}', '${address}', '${detail_address}', '${permission}')
  `;
    try {
        connection.query(query, (error, results, fields) => {
            if (error) throw error;
            console.log(`User ${u_id} is created`);
        });
    }catch (e) {
        console.error(e)
    }
}

// boards table
for (let i = 0; i < 100; i++) {
    const u_id = faker.internet.userName();
    const title = faker.lorem.sentence();
    const content = faker.lorem.paragraphs();
    const post_time = faker.date.past().toISOString().slice(0, 19).replace('T', ' ');
    const status = faker.random.arrayElement(['PUBLIC', 'PRIVATE', 'REPORT', 'BLOCK']);

    const query = `
    INSERT INTO boards (u_id, title, content, post_time, status) 
    VALUES ('${u_id}', '${title}', '${content}', '${post_time}', '${status}')
  `;
    try {
        connection.query(query, (error, results, fields) => {
            if (error) throw error;
            console.log(`Board ${results.insertId} is created`);
        });
    }catch (e) {
        console.error(e)
    }
}

// board_replies table
for (let i = 0; i < 100; i++) {
    const b_id = faker.random.number({ min: 1, max: 100 });
    const r_id = faker.random.number({ min: 1, max: 100 });
    const content = faker.lorem.paragraph();
    const post_time = faker.date.past().toISOString().slice(0, 19).replace('T', ' ');
    const status = faker.random.arrayElement(['PUBLIC', 'PRIVATE', 'REPORT', 'BLOCK']);

    const query = `
    INSERT INTO board_replies (b_id, r_id, content, post_time, status) 
    VALUES ('${b_id}', '${r_id}', '${content}', '${post_time}', '${status}')
  `;
    try {
        connection.query(query, (error, results,fields) => {
            if (error) throw error;
            console.log(`Board reply ${results.insertId} is created`);
        });
    }catch (e) {
        console.error(e)
    }
}

// board_likes table
for (let i = 0; i < 100; i++) {
    const b_id = faker.random.number({ min: 1, max: 100 });
    const u_id = faker.internet.userName();
    const status = faker.random.arrayElement(['LIKE', 'BAD', 'SAD', 'BEST']);

    const query = `INSERT INTO board_likes (b_id, u_id, status) VALUES ('${b_id}', '${u_id}', '${status}')` ;
    try {

        connection.query(query, (error, results, fields) => {
            if (error) throw error;
            console.log(`Board like ${results.insertId} is created`);
        });
    }catch (e) {
        console.error(e)
    }

}

// reply_likes table
for (let i = 0; i < 100; i++) {
    const br_id = faker.random.number({ min: 1, max: 100 });
    const u_id = faker.internet.userName();
    const status = faker.random.arrayElement(['LIKE', 'BAD', 'SAD', 'BEST']);

    const query = `INSERT INTO reply_likes (br_id, u_id, status) VALUES ('${br_id}', '${u_id}', '${status}')` ;
    try {

        connection.query(query, (error, results, fields) => {
            if (error) throw error;
            console.log(`Reply like ${results.insertId} is created`);
        });
    }catch (e) {
        console.error(e);
    }
}

// board_imgs table
for (let i = 0; i < 100; i++) {
    const b_id = faker.random.number({ min: 1, max: 100 });
    const img_path = faker.image.imageUrl();

    const query = `INSERT INTO board_imgs (b_id, img_path) VALUES ('${b_id}', '${img_path}')` ;
    try {

        connection.query(query, (error, results, fields) => {
            if (error) throw error;
            console.log(`Board image ${results.insertId} is created`);
        });
    }catch (e) {
        console.error(e);
    }
}

// hash_tags table
for (let i = 0; i < 100; i++) {
    const b_id = faker.random.number({ min: 1, max: 100 });
    const br_id = faker.random.number({ min: 1, max: 100 });
    const tag = faker.lorem.word();

    const query = `INSERT INTO hash_tags (b_id, br_id, tag) VALUES ('${b_id}', '${br_id}', '${tag}') `;
    try {

        connection.query(query, (error, results, fields) => {
            if (error) throw error;
            console.log(`Hash tag ${results.insertId} is created`);
        });
    }catch (e) {
        console.error(e)
    }
}

connection.end();


