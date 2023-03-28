<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%@include file="/templates/headerNav.jsp"%>
    <main class="container">
<%-- 파일을 파라미터로 전송하려면 어떻게 해야할까요??
    default : form은 문자열 파라미터만 쿼리스트링(x-www-form-urlencoded) 전송(파일은 무시하고 파일 이름만 전송
    multipart/form-data : form의 모든 데이터를 BLOB 바이너리 형식으로 전송(file ==BLOB)
    톰캣 서블릿 : multipart/form-data를 처리할 수 없어서 cos.jar 라이버리를 사용했어야했다..
    톰캣7, 서블릿 3.0 이상부터는 @MultipartConfig를 사용할 수 있다.

    //enctype="application/x-www-form-urlencoded" default : 문자열인 데이터만 쿼리스트링으로 보낸다.(blob 데이터인 파일은 전송하지 않는다. )
    //enctype="multipart/form-data" : 모든 데이터를 Blob 로 보낸다.(모든데이터를 파일로 취급)
    //톰캣 blob 파라미터를 처리하기 위해서 cos jar 를 사용, express multer 를 사용

--%>
        <form name="signupForm" action="./signup.do" method="post" enctype="multipart/form-data" style="width: 500px;margin: 0 auto;">
            <h1 class="my-4">회원가입</h1>
            <p class="form-floating">
                <input id="uIdInput" type="text" name="u_id" value="test_test1" class="form-control" placeholder="??">
                <label class="">아이디</label>
            </p>
            <p class="form-floating">
                <input type="text" name="name" value="테스트유저" class="form-control" placeholder="??">
                <label>이름</label>
            </p>
            <p class="form-floating">
                <input type="password" name="pw" value="1234" class="form-control" placeholder="??">
                <label>패스워드</label>
            </p>
            <p class="form-floating">
                <input type="password" name="check_pw" value="1234" class="form-control" placeholder="??">
                <label>패스워드 체크</label>
            </p>
            <p class="input-group">
                <label class="input-group-text">프로필</label>
                <input type="file" name="img_path" value="" class="form-control" placeholder="??">
            </p>
            <p class="form-floating">
                <input type="text" name="phone" value="91099991111" class="form-control" placeholder="??">
                <label>핸드폰</label>
            </p>
            <p class="form-floating">
                <input type="text" name="email" value="test_test@gamil.com" class="form-control" placeholder="??">
                <label>이메일</label>
            </p>
            <p class="form-floating">
                <input type="date" name="birth" value="1986-05-25" class="form-control" placeholder="??">
                <label>생일</label>
            </p>
            <p class="form-floating">
                <select name="gender" class="form-control">
                    <option value="MALE" >남자</option>
                    <option value="FEMALE" >여자</option>
                    <option value="NONE" selected>없음</option>
                </select>
                <label>성별</label>
            </p>
            <p class="form-floating">
                <input type="text" name="address" value="서울시" class="form-control" placeholder="??">
                <label>주소</label>
            </p>
            <p class="form-floating">
                <input type="text" name="detail_address" value="압구정" class="form-control" placeholder="??">
                <label>주소상세</label>
            </p>
            <p class="text-end">
                <button class="btn btn-outline-warning" type="reset">초기화</button>
                <button class="btn btn-outline-primary">회원가입</button>
            </p>
        </form>
        <script>
            const signupForm=document.forms["signupForm"];
            const uIdInput=signupForm.u_id;

            uIdInput.addEventListener("change",uIdInputHandler);
            document.addEventListener("DOMContentLoaded",async ()=>{
                await uIdInputHandler();
            })
            signupForm.onsubmit=async function (e){
                e.preventDefault();
                let uIdCheck=await uIdInputHandler();
                if(uIdCheck){
                    signupForm.submit();
                }else {
                    window.location.href="#uIdInput";

                }
            }

            async function uIdInputHandler(){
                let uId=uIdInput.value;
                let url="./idCheck.do?u_id="+uId;
                let msgLabel=uIdInput.nextElementSibling;
                if(uId.length<4){
                    msgLabel.innerText="아이디는 4글자 이상입니다."
                    uIdInput.classList.remove("is-valid");
                    msgLabel.classList.remove("valid-feedback");
                    uIdInput.classList.add("is-invalid");
                    msgLabel.classList.add("invalid-feedback");
                    return false;
                }

                let res=await fetch(url);
                let json=await res.json();

                if(!json.checkId){
                    msgLabel.innerText="사용 가능한 아이디 입니다."
                    uIdInput.classList.remove("is-invalid");
                    msgLabel.classList.remove("invalid-feedback");
                    uIdInput.classList.add("is-valid");
                    msgLabel.classList.add("valid-feedback");
                    return true;
                }else{
                    msgLabel.innerText="사용 중인 아이디 입니다."
                    uIdInput.classList.remove("is-valid");
                    msgLabel.classList.remove("valid-feedback");
                    uIdInput.classList.add("is-invalid");
                    msgLabel.classList.add("invalid-feedback");
                }
            }
        </script>
    </main>
</body>
</html>
