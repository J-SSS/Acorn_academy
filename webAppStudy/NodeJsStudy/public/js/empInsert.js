// alert("안녕...!!")
//
// window.onload=function (){ //브라우저가 document를 모두 load 하고 image와 스타일 적용까지 완료한 시점에 실행됨
//     const empInsertForm=document.forms["empInsertForm"];
//     console.log(empInsertForm) //스크립트가 dom node 생성보다 먼저 실행돼서
// }
// window.onload=function (){
//     console.log("두번째 콜백함수")
// }
// //node에 이벤트의 콜백함수를 직접정의하면 마지막 콜백함수만 실행된다
//
// window.addEventListener("load"),()=>{
//     console.log("addEventListner로 정의한 콜백함수")
// }
//
// //document.DOMcontentsLoaded : 브라우저가 docum,ent를 모두 loade한 시점에 (addEventListner로만 작성가능)
// document.addEventListener("DOMContentLoaded",()=>{
//     console.log("DOMContentLoad로 정의한 콜백함수...")
// })

//항의!! 콜백함수에 정의하는 것이 너무 복잡하고 보기싫다..
//script에 defer(boolean)라는 속성을 주면 DOMcontentLoaded 시점까지 기다렸다가 스크립트를 실행

const empInsertForm=document.forms["empInsertForm"];
empInsertForm.empno.onchange= async function (e){
    let val = this.value;
    let url="/empnoCheck.do?empno="+val;

    const res = await fetch(url);; //.then((res)=>{return res.json()})
    if(res.status==200){
    const obj = await res.json(); //.then((obj)=>{...})
        console.log(obj)
        if(obj.checkId){
            empnoMsg.innerText=obj.ENAME+"이 사용 중인 사번입니다."
        } else {
            empnoMsg.innerText="사용 가능한 사번입니다"
        }


    } else if(res.status==400){
        this.value="";
        alert("정수만 입력하세요!");
    } else {
        alert(res.status+" 오류입니다.. 다시시도!!")
    }
}

