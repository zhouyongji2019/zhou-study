``
HTTP 和 HTTPS 的区别
HTTPS是HTTP的安全版本，即加入了SSL验证，底层实现依然基于HTTP
``HTTPS需要到ca申请证书
``HTTP是明文传输，HTTPS是加密传输
``HTTP和HTTPS使用的是全完不同的连接方式，端口HTTP默认使用80端口，HTTPS使用443

HTTP1.0 和 HTTP1.1

主要区别在HTTP1.0使用短连接，每次客户端发起请求都要创建一个新连接。

HTTP可以使用长连接，在请求头中修改keep-alive的值，或者设置为close

HTTP2.0采用多路复用技术，允许通过单一的连接发起多重的请求消息。

HTTPS都是加密的请求，基于SSL协议（Secure Sockets Layer）