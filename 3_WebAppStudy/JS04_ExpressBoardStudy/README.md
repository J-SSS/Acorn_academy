# ExpressJsBoardAdmin230302
# mysql 커뮤니티 서버를 설치하고 webAppBoard.sql 를 실행시켜서 db를 만드세요! 
# npm i 로 의존성 주입(package.json)된 node 모듈을 설치하세요! 
# 개발시에 nodemon app.js 로 서버를 시작하세요!

<h2>주의 사항!! </h2> 
<ul>
    <li>main branch 에서 작업하지 마세요!</li>
    <li>수업에서 따라서 작성할 때는 study 브랜치를 생성해서 작업하세요.</li>
</ul>

<h2>프로젝트에 기여하고 싶다면 </h2>
<ul>
    <li>git checkout main : 메인 브랜치 선택</li>
    <li>git pull origin main : 메인 브랜치 최신이력 가져오기</li>
    <li>git checkout -b '작업할 가지이름 : replyInsert,boardListView ' : 작업할 새로운 가지 생성</li>
    <li>git add .</li>
    <li>git commit -m "코멘트" (자주)</li>
    <li>git push origin '작업할 가지이름' (마지막 한번)</li>
    <li>나머지 팀장이 병합하기 때문에 신경쓰지 마세요!!</li>
</ul>

<h2>팀장이 병합하는 방법</h2>
<ul>
    <li>리모트 저장소에 올라온 최신 이력을 살펴 본다</li>
    <li>git fetch origin '팀원의 가지'</li>
    <li>git checkout --track origin/'팀원의 가지' : '팀원의 가지'가 로컬에 생성</li>
    <li>실행 및 구동 테스트!</li>
    <li>git merge '팀원의 가지'</li>
    <li>살펴볼 필요 없이 바로 병합하고 싶은 경우</li>
    <li>git pull origin '팀원 가지'</li>
    <li>병합 충돌이 발생한 경우</li>
    <li>충돌 내역을 수정하고 git add ., git commit -m "병합완료"</li>
    <li>git push origin main</li>
    <li>팀원들이 main 최신 이력으로 pull 해서 새로가지 만들고 작업...</li>
</ul>
