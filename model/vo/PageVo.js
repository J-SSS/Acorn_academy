class PageVo{
    #totalPage; // 총 페이지 수
    #totalRow; // 조회된 게시글의 전체 수
    #page; //현재 화면에 출려될 페이지
    #next;
    #prev;
    #isNext;
    #isPrev;

    #rowLength=5; //화면에 출력될 row수
    #offset; // LIMIT offset, rowLength;로 사용
    #query; //page를 제외한 쿼리
    //{status:"PUBLIC",order:"b_id",page:3} => status=PUBLIC&order=b_id&

    #searchField; //검색할 칼럼
    #searchValue; //검색할 칼럼의 내용
    #orderField; //정렬
    #orderDirect;

    get orderDirect() {
        return this.#orderDirect;
    }

    set orderDirect(value) {
        this.#orderDirect = value;
    }

    constructor(page,totalRow,reqQuery,rowLength=5) {
        this.#page=page;
        this.#totalRow=totalRow;
        this.#rowLength=rowLength;
        this.#offset=(page-1)*rowLength;
        this.#totalPage=Math.ceil(totalRow/rowLength);
        this.#next=page+1;
        this.#prev=page-1;
        this.#isNext=(this.#next<=this.#totalPage);
        this.#isPrev=(this.#prev>=1);
        this.#query=""; //undefined+"ab" =>"undefinedab"
        for (let key in reqQuery) {
            if (key !== "page") {
                this.#query += `${key}=${reqQuery[key]}&`
                if (key === "field") {
                    this.#searchField = reqQuery[key];
                } else if (key === "value") {
                    this.#searchValue = reqQuery[key];
                } else if(key==="orderField"){
                    this.#orderField = reqQuery[key];
                } else if(key==="orderDirect"){
                    this.#orderDirect = reqQuery[key];
                }
            }
        }
    }


    get offset() {
        return this.#offset;
    }

    set offset(value) {
        this.#offset = value;
    }

    get totalPage() {
        return this.#totalPage;
    }

    set totalPage(value) {
        this.#totalPage = value;
    }

    get next() {
        return this.#next;
    }

    set next(value) {
        this.#next = value;
    }

    get prev() {
        return this.#prev;
    }

    set prev(value) {
        this.#prev = value;
    }

    get isNext() {
        return this.#isNext;
    }

    set isNext(value) {
        this.#isNext = value;
    }

    get isPrev() {
        return this.#isPrev;
    }

    set isPrev(value) {
        this.#isPrev = value;
    }
    get rowLength(){
        return this.#rowLength;
    }
    get page(){
        return this.#rowLength;
    }
    get totalRow(){
        return this.#totalRow;
    }
    get query(){
        return this.#query;
    }

    get searchField() {
        return this.#searchField;
    }

    set searchField(value) {
        this.#searchField = value;
    }

    get searchValue() {
        return this.#searchValue;
    }

    set searchValue(value) {
        this.#searchValue = value;
    }

    get orderField() {
        return this.#orderField;
    }

    set orderField(value) {
        this.#orderField = value;
    }
}

module.exports=PageVo;
