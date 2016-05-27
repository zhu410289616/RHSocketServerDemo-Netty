package com.zrh.socket.protobuf.test;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

public class AuthClientInitHandler extends ChannelInboundHandlerAdapter {

	@Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
		System.out.println("AuthClientInitHandler exceptionCaught");
        Auth.AuthRequest request=Auth.AuthRequest.newBuilder()
                             .setUserId(10203)
                             .setPassword("abcde")
                             .build();
        ctx.writeAndFlush(request);
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg)
            throws Exception {
    	System.out.println("AuthClientInitHandler channelRead");
        Auth.AuthResponse response=(Auth.AuthResponse)msg;
        System.out.println("response: code="+response.getResultCode()+", message="+response.getResultMsg());
        //ctx.close();
    }

}
