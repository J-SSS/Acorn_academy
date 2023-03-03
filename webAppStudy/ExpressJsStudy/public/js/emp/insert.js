const empInsertForm=document.forms["empInsertForm"];
const empnoInput=empInsertForm["empno"];
const empnoMsg=document.getElementById("empnoMsg")
const EMPNO_CHECK_URL="/emp/empnoCheck.do";
empnoInput.addEventListener("change",empnoHandler);
empInsertForm.addEventListener("submit",submitHandler);
async function submitHandler(e){
    e.preventDefault();
    let empnoCheck=await empnoHandler();
    if(empnoCheck){
        empInsertForm.submit();
    }
}
async function empnoHandler(){
    let val=(empnoInput.value);
    let check=false;
    const res=await fetch(EMPNO_CHECK_URL+"?empno="+val);
    if(res.status===200){
        const obj=await res.json();
        if(obj.check){
            empnoMsg.innerText=`${obj.emp.ENAME}이(가) 사용 중인 사원번호입니다.`;
        }else{
            empnoMsg.innerText="사용 가능한 사원번호입니다.";
            return true;
        }
    }else if(res.status===400){
        empnoMsg.innerText="잘못된 요청입니다.(400)";
    }else if(res.status===500){
        empnoMsg.innerText="조회 요류! 다시 시도하세요!(500)";
    }
    // fetch(EMPNO_CHECK_URL+"?empno="+val).then((res)=>{
    //     if(res.status===200){
    //         return res.json();
    //     }else if(res.status===400){
    //         empnoMsg.innerText="잘못된 요청입니다.(400)";
    //     }else if(res.status===500){
    //         empnoMsg.innerText="조회 요류! 다시 시도하세요!(500)";
    //     }
    // }).then((obj)=>{
    //     if(obj["check"]){
    //         empnoMsg.innerText=obj["emp"]["ENAME"]+"이(가) 사용하고 있는 사원번호입니다.";
    //     }else{
    //         empnoMsg.innerText="사용 가능한 사원번호입니다.";
    //         check=true; //비동기코드라 소용없음!
    //     }
    // });
    return check;
}