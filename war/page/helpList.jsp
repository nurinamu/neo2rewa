<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>helpList</title>
    <!-- Bootstrap -->
    <link href="/css/bootstrap.css" rel="stylesheet" />
  </head>
  <body>
<!-- Header -->
    <div class="navbar navbar-default navbar-static-top" role="navigation">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">착한 중개인</a>
        </div>
        <div class="col-lg-8"></div>
        <div class="navbar-collapse collapse">
          <ul class="nav navbar-nav navbar-right">
            <li><a href="#about">로그인</a></li>
            <li><a href="#contact">회원가입</a></li>
          </ul>
        </div>
      </div>
    </div>
<<<<<<< HEAD
    <div style="padding-top:20px;padding-bottom:5px;background-color:#ffc000">
      <div class="container">
      <div class="row">
        <div class="col-lg-2"><p>고담시 수해 복구 지원</p></div>
        <div class="col-lg-10">
            <ul class="nav nav-pills" role="tablist" id="myTab">
=======
<!-- Header End -->

    <div style="margin-top:20px">
      <div>
        <table class="container" ><tr>
          <td id="dsTitle"></td>
          <td >
            <ul class="nav nav-pills-iv" role="tablist" id="myTab">
>>>>>>> cosmetic changes.
              <li class="active"><a href="#home" role="tab" data-toggle="tab">현황 안내</a></li>
              <li><a href="#support" role="tab" data-toggle="tab">물품 지원</a></li>
              <li><a href="#volunteer" role="tab" data-toggle="tab">봉사 지원</a></li>
            </ul>
        </div>
      </div>
    </div>
    </div>
    <div class="tab-content">
      <div class="tab-pane active" id="home">
        <style type="text/css">
/*
      body {
   
      }*/

      /* Custom container */
      .container-narrow {
             padding-top: 20px;
        padding-bottom: 40px;
        margin: 0 auto;
        max-width: 700px;
      }
      .container-narrow > hr {
        margin: 30px 0;
      }

      /* Main marketing message and sign up button */
      .jumbotron {
        margin: 60px 0;
        text-align: center;
      }
      .jumbotron h1 {
        font-size: 72px;
        line-height: 1;
      }
      .jumbotron .btn {
        font-size: 21px;
        padding: 14px 24px;
      }

      /* Supporting marketing content */
      .marketing {
        margin: 60px 0;
      }
      .marketing p + h4 {
        margin-top: 28px;
      }
    
        </style>
        <div class="container-narrow">
        <table border="0">
          <tr>
            <td colspan="2">
              <textarea style="border:0px;" class="form-control" id="dsDesc"></textarea>
            </td>
            <td rowspan="6">
              <div id="map-canvas"></div>
            </td>
          </tr>
          <tr>
            <td>구분:</td>
            <td id="dsType"></td>
          </tr>
          <tr>
            <td>관할서:
            </td>
            <td id="dsArea"></td>
          </tr>
          <tr>
            <td>담당자:
            </td>
            <td id="dsOwner"></td>
          </tr>
        </table>
      </div>
      
      <div class="tab-pane" id="supply">
        <div class="panel-group" id="supplyPanel">
            <!-- dynamic collapse part -->
            <div class="panel panel-default">
              <div class="panel-heading">
                <h4 class="panel-title">
                  <a data-toggle="collapse" data-parent="#supplyPanel" href="#supply_" name="supName"></a>
                </h4>
              </div>
              <div id="supply_" class="panel-collapse collapse in">
                <div class="panel-body">
                  <table>
                    <tr>
                      <td colspan="2" name="supDesc"></td>
                      <td rowspan="5">
                        <a class="btn btn-primary btn-lg" role="button">지원하</a>
                      </td>
                    </tr>
                    <tr>
                      <td>품목 :</td>
                      <td name="subName"></td>
                    </tr>
                    <tr>
                      <td>현재수량(목표수량) :</td>
                      <td><span name="have"></span>(<span name="needs"></span>)</td>
                    </tr>
                  </table>
                </div>
              </div>
            </div>
            <!-- dynamic collapse part end-->
          </div>
      </div>
      <div class="tab-pane" id="volunteer">
        <div class="panel-group" id="volunteerPanel">
        <!-- dynamic collapse part -->
            <div class="panel panel-default">
              <div class="panel-heading">
                <h4 class="panel-title">
                  <a data-toggle="collapse" data-parent="#volunteerPanel" href="#collapseOne">
                    Collapsible Group Item #1
                  </a>
                </h4>
              </div>
          <div id="collapseOne" class="panel-collapse collapse in">
                <div class="panel-body">
                  Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor, sunt aliqua put a bird on it squid single-origin coffee nulla assumenda shoreditch et. Nihil anim keffiyeh helvetica, craft beer labore wes anderson cred nesciunt sapiente ea proident. Ad vegan excepteur butcher vice lomo. Leggings occaecat craft beer farm-to-table, raw denim aesthetic synth nesciunt you probably haven't heard of them accusamus labore sustainable VHS.
                </div>
          </div>
            </div>

            </div>
          </div>
      </div>
    </div>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="/js/bootstrap.min.js"></script>
  </body>
</html>