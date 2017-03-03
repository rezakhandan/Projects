<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html >
<head>
  <meta charset="UTF-8">
  <title>فرم پذیرش</title>
 


  
    <link href="${pageContext.request.contextPath}/static/css/bootstrap.min.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/static/css/bootstrap-theme.min.css" rel="stylesheet" >
<link href="${pageContext.request.contextPath}/static/css/bootstrapValidator.min.css" rel="stylesheet" >

      <link rel="stylesheet" href="css/style.css">

  
</head>

<body>
  <div class="container">

    <form class="well form-horizontal" action="/Hospital/PazireshPage" method="post"  id="contact_form">
<fieldset>


<h3 align = right>فرم پذیرش</h3>


<div class="form-group">
  <label class="col-md-4 control-label">نام</label>  
  <div class="col-md-4 inputGroupContainer">
  <div class="input-group">
  <input  name="Name"  class="form-control"  type="text">
    </div>
  </div>
</div>

<!-- Text input-->

<div class="form-group">
  <label class="col-md-4 control-label" >نام خانوادگی</label> 
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
  <input name="Family"  class="form-control"  type="text">
    </div>
  </div>
</div>

<!-- Text input-->
       <div class="form-group">
  <label class="col-md-4 control-label">نام پدر</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
  <input name="FatherName"  class="form-control"  type="text">
    </div>
  </div>
</div>


<!-- Text input-->
       
<div class="form-group">
  <label class="col-md-4 control-label">کد ملی</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
  <input name="MCode" class="form-control" type="text">
    </div>
  </div>
</div>

<!-- Text input-->
      
<div class="form-group">
  <label class="col-md-4 control-label">محل تولد</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
  <input name="City" class="form-control" type="text">
    </div>
  </div>
</div>

<!-- Text input-->
 
<div class="form-group">
  <label class="col-md-4 control-label">تلفن همراه</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
  <input name="MobileNumber" class="form-control"  type="text">
    </div>
  </div>
</div>

<div class="form-group">
  <label class="col-md-4 control-label">تلفن ثابت </label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
  <input name="HomeNumber"  class="form-control"  type="text">
    </div>
</div>
</div>

<div class="form-group">
  <label class="col-md-4 control-label">نوع بیماری </label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
  <input name="IllnessKind"  class="form-control"  type="text">
    </div>
</div>
</div>
<!-- Select Basic -->
   
<div class="form-group"> 
  <label class="col-md-4 control-label">نوع بیمه</label>
    <div class="col-md-4 selectContainer">
    <div class="input-group">
    <select name="InsuranceKind" class="form-control selectpicker" >
      <option value=" " >بیمه خود را انتخاب کنید</option>
      <option>Tamin Ejtemaee </option>
      <option>Rustaee</option>
      <option >Talaee</option>
      <option >Sayer</option>
    </select>
  </div>
</div>
</div>

 <div class="form-group">
                        <label class="col-md-4 control-label">جنسیت</label>
                        <div class="col-md-4">
                            <div class="radio">
                                <label>
                                    <input type="radio" name="Gender" value="Male" /> مرد
                                </label>
                            </div>
                            <div class="radio">
                                <label>
                                    <input type="radio" name="Gender" value="Female" /> زن
                                </label>
                            </div>
                        </div>
                    </div>

<!-- Text area -->
  
<div class="form-group">
  <label class="col-md-4 control-label">آدرس</label>
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-pencil"></i></span>
        	<textarea class="form-control" name="Address"></textarea>
  </div>
  </div>
</div>

<!-- Button -->
<div class="form-group">
  <label class="col-md-4 control-label"></label>
  <div class="col-md-4">
    <button type="submit" class="btn btn-warning" >ثبت </button>
  </div>
</div>

</fieldset>
</form>
</div>
    </div><!-- /.container -->
    <script src="js/index.js"></script>

</body>
</html>
