<html>
<#include "../header.ftlh">

<body>
<div id="wrapper" class="toggled">

    <#--sidebar-->
    <#include "../nav.ftlh">

    <#--content-->
    <div id="page-content-wrapper">
        <div class="container-fluid">
            <div class="row clearfix">
                <div class="col-md-12 column">
                    <table class="table table-bordered table-condensed">
                        <thead>
                        <tr>
                            <th>regression Run ID</th>
                            <th>App</th>
                            <th colspan="2">Action</th>
                        </tr>
                        </thead>
                        <tbody>

                        <#list orderDTOPage.content as orderDTO>
                            <tr>
                                <td>${orderDTO.regressionrunid}</td>
                                <td>${orderDTO.app}</td>
                                <td><a href="/sell/seller/order/detail?orderId=${orderDTO.regressionrunid}">Details</a></td>
                                <td>
                                    <#if orderDTO.getOrderStatusEnum().getCode() == 0>
                                        <a href="/sell/seller/order/cancel?orderId=${orderDTO.regressionrunid}">Cancel</a>
                                    </#if>
                                </td>
                            </tr>
                        </#list>
                        </tbody>
                    </table>
                </div>

                <#--pagination-->
                <div class="col-md-12 column">
                    <ul class="pagination pull-right">
                        <#if currentPage lte 1>
                            <li class="disabled"><a href="#">prev</a></li>
                        <#else>
                            <li><a href="/sell/seller/order/list?page=${currentPage - 1}&size=${size}">prev</a></li>
                        </#if>

                        <#list 1..orderDTOPage.getTotalPages() as index>
                            <#if currentPage == index>
                                <li class="disabled"><a href="#">${index}</a></li>
                            <#else>
                                <li><a href="/sell/seller/order/list?page=${index}&size=${size}">${index}</a></li>
                            </#if>
                        </#list>

                        <#if currentPage gte orderDTOPage.getTotalPages()>
                            <li class="disabled"><a href="#">next</a></li>
                        <#else>
                            <li><a href="/sell/seller/order/list?page=${currentPage + 1}&size=${size}">next</a></li>
                        </#if>
                    </ul>
                </div>
            </div>
        </div>
    </div>

</div>

<#--pop window-->
<div class="modal fade" id="myModal" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                <h4 class="modal-title" id="myModalLabel">
                    Notification
                </h4>
            </div>
            <div class="modal-body">
                New Order!
            </div>
            <div class="modal-footer">
                <button onclick="javascript:document.getElementById('notice').pause()" type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                <button onclick="location.reload()" type="button" class="btn btn-primary">Look into details</button>
            </div>
        </div>
    </div>
</div>
</body>
</html>