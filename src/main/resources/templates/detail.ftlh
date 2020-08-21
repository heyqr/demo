<html>
<#include "header.ftlh">

<body>
<div id="wrapper" class="toggled">

    <#--边栏sidebar-->
    <#include "nav.ftlh">

    <div id="page-content-wrapper">
        <div class="container">
            <div class="row clearfix">
                <div class="col-md-6 column">
                    <table class="table table-bordered">
                        <thead>
                        <tr>
                            <th>Order Id</th>
                            <th>Order Amount</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td>${orderDTO.orderId}</td>
                            <td>${orderDTO.orderAmount}</td>
                        </tr>
                        </tbody>
                    </table>
                </div>

                <#--订单详情表数据-->
                <div class="col-md-12 column">
                    <table class="table table-bordered">
                        <thead>
                        <tr>
                            <th>Item id</th>
                            <th>Item Name</th>
                            <th>Unit Price</th>
                            <th>Quantity</th>
                            <th>Item Total</th>
                        </tr>
                        </thead>
                        <tbody>
                        <#list orderDTO.orderDetails as orderDetail>
                            <tr>
                                <td>${orderDetail.productId}</td>
                                <td>${orderDetail.productName}</td>
                                <td>${orderDetail.productPrice}</td>
                                <td>${orderDetail.productAmount}</td>
                                <td>${orderDetail.productAmount * orderDetail.productPrice}</td>
                            </tr>
                        </#list>
                        </tbody>
                    </table>
                </div>

                <#--操作-->
                <div class="col-md-12 column">
                    <#if orderDTO.getOrderStatusEnum().getCode() == 0>
                        <a href="/sell/seller/order/fulfill?orderId=${orderDTO.orderId}" type="button" class="btn btn-default btn-success">Fulfill</a>
                        <a href="/sell/seller/order/cancel?orderId=${orderDTO.orderId}" type="button" class="btn btn-default btn-danger">Cancel</a>
                    </#if>
                    <a href="/sell/seller/order/list" type="button" class="btn btn-default btn-primary">Return</a>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>