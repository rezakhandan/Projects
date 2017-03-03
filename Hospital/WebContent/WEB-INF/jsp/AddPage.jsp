<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <title>اضافه کردن بیمارستان</title>
  </script>


  
    <link href="${pageContext.request.contextPath}/static/css/bootstrap.min.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/static/css/bootstrap-theme.min.css" rel="stylesheet" >
<link href="${pageContext.request.contextPath}/static/css/bootstrapValidator.min.css" rel="stylesheet" >
      <link rel="stylesheet" href="css/style.css">

  
</head>

<body>
  <div class="container">

    <form class="well form-horizontal" action="/Hospital/AddPage" method="post"  id="contact_form">
<fieldset>


<h3 align = right>فرم اضافه کردن بیمارستان</h3>

       
<div class="form-group">
  <label class="col-md-4 control-label">کد بیمارستان</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
  <input name="code" class="form-control" type="text">
    </div>
  </div>
</div>

<div class="form-group">
  <label class="col-md-4 control-label">نام بیمارستان</label>  
  <div class="col-md-4 inputGroupContainer">
  <div class="input-group">
  <input  name="HospitalName"  class="form-control"  type="text">
    </div>
  </div>
</div>

<!-- Text input-->

<div class="form-group">
  <label class="col-md-4 control-label" >نام مدیر </label> 
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
  <input name="AdminName"  class="form-control"  type="text">
    </div>
  </div>
</div>

<!-- Text input-->
       <div class="form-group">
  <label class="col-md-4 control-label">شماره تلفن</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
  <input name="PhoneNumber"  class="form-control"  type="text">
    </div>
  </div>
</div>

<div class="form-group"> 
  <label class="col-md-4 control-label">نوع بیمارستان </label>
    <div class="col-md-4 selectContainer">
    <div class="input-group">
    <select name="KindHospital" class="form-control selectpicker" >
      <option value="KindHospital" ></option>
      <option>khosusi</option>
      <option>nime khosusi</option>
      <option >dolati</option>
    </select>
  </div>
</div>
</div>

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
