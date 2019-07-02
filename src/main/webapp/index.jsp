<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<html>
<head>
    <title>license列表</title>
    <%
        pageContext.setAttribute("APP_PATH", request.getContextPath());
    %>
    <%--JQuery--%>
    <script type="text/javascript" src="${APP_PATH}/static/jquery-3.3.1.min.js"></script>
    <%--Boostrap--%>
    <!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    <script type="text/javascript">
        var APP_PATH = "${APP_PATH}";
    </script>
    <script type="text/javascript" src="${APP_PATH}/static/js/index.js"></script>

</head>
<body>
<div class="container">
    <%--标题--%>
    <div class="row">
        <div class="col-md-12">
            <h1>license列表</h1>
        </div>
    </div>
    <%--按钮--%>
    <div class="row">
        <div class="col-md-4 col-md-offset-8">
            <button class="btn btn-primary" id="emp_add_modal_btn">新增</button>
            <%--<button class="btn btn-danger" id="emp_delete_all_btn">删除</button>--%>
        </div>
    </div>
    <%--表格数据--%>
    <div class="row">
        <div class="col-md-12">
            <table class="table table-hover" id="emps_table">
                <thead>
                    <tr>
                        <th>
                            <input type="checkbox" id="check_all">
                        </th>
                        <th>注册码</th>
                        <th>项目ID</th>
                        <th>试用期限</th>
                        <th>授权次数</th>
                        <th>备注</th>
                    </tr>
                </thead>
                <tbody>
                </tbody>
            </table>
        </div>
    </div>
    <%--分页信息--%>
    <div class="row">
        <div class="col-md-6" id="page_info_area">
        </div>
        <div class="col-md-6" id="page_nav_area">
        </div>
    </div>
</div>

<!-- 员工添加模态框 -->
<div class="modal fade" id="empAddModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabel">添加License</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal">
                    <div class="form-group">
                        <label for="license_add_input" class="col-sm-2 control-label">注册码</label>
                        <div class="col-sm-10">
                            <input type="text" name="licenseid" class="form-control" id="license_add_input" placeholder="XXXX-XXXX-XXXX-XXXX">
                            <span class="help-block"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">项目ID</label>
                        <div class="col-sm-4">
                            <select name="projectid" class="form-control">
                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="runDay_add_input" class="col-sm-2 control-label">试用期限</label>
                        <div class="col-sm-10">
                            <input type="text" name="runday" class="form-control" id="runDay_add_input" placeholder="runDay">
                            <span class="help-block"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="regNum_add_input" class="col-sm-2 control-label">授权次数</label>
                        <div class="col-sm-10">
                            <input type="text" name="regnum" class="form-control" id="regNum_add_input" placeholder="regNum">
                            <span class="help-block"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="options_add_input" class="col-sm-2 control-label">备注</label>
                        <div class="col-sm-10">
                            <input type="text" name="options" class="form-control" id="options_add_input" placeholder="options">
                            <span class="help-block"></span>
                        </div>
                    </div>

                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" id="emp_save_btn">保存</button>
            </div>
        </div>
    </div>
</div>

<!-- 员工修改模态框 -->
<div class="modal fade" id="empUpdateModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title">licenses修改</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal">

                    <div class="form-group">
                        <label class="col-sm-2 control-label">注册码</label>
                        <div class="col-sm-10">
                            <p class="form-control-static" id="empName_update_static"></p>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-2 control-label">项目ID</label>
                        <div class="col-sm-4">
                            <select name="projectid" class="form-control">
                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="runDay_save_input" class="col-sm-2 control-label">试用期限</label>
                        <div class="col-sm-10">
                            <input type="text" name="runday" class="form-control" id="runDay_save_input" placeholder="runDay">
                            <span class="help-block"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="regNum_save_input" class="col-sm-2 control-label">授权次数</label>
                        <div class="col-sm-10">
                            <input type="text" name="regnum" class="form-control" id="regNum_save_input" placeholder="regNum">
                            <span class="help-block"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="options_save_input" class="col-sm-2 control-label">备注</label>
                        <div class="col-sm-10">
                            <input type="text" name="options" class="form-control" id="options_save_input" placeholder="options">
                            <span class="help-block"></span>
                        </div>
                    </div>

                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" id="emp_update_btn">更新</button>
            </div>
        </div>
    </div>
</div>
</body>
</html>
