package com.zrh.socket.protobuf.test;

import com.zrh.socket.core.codec.proto.BaseProtocol;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

public class AuthServerInitHandler extends ChannelInboundHandlerAdapter {

	@Override
    public void channelRead(ChannelHandlerContext ctx, Object msg)
            throws Exception {
		System.out.println("AuthServerInitHandler channelRead");
		
//		BaseProtocol.RHBaseMessage temp = (BaseProtocol.RHBaseMessage)msg;
//		System.out.println("request: " + temp.getProtobufClassName());
//		BaseProtocol.RHBaseMessage rsp = BaseProtocol.RHBaseMessage.newBuilder()
//				.setProtobufType(temp.getProtobufType())
//				.setProtobufClassName(temp.getProtobufClassName())
//				.setProtobufData(temp.getProtobufData())
//				.build();
//      ctx.writeAndFlush(rsp);
		
        Auth.AuthRequest request=(Auth.AuthRequest)msg;
        System.out.println("request: userId="+request.getUserId()+", password="+request.getPassword());
        Auth.AuthResponse response = Auth.AuthResponse.newBuilder().setResultCode(0).setResultMsg("success").build();
        ctx.writeAndFlush(response);
        //ctx.close();
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
    	System.out.println("AuthServerInitHandler channelReadComplete");
        ctx.flush();
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause)
            throws Exception {
    	System.out.println("AuthServerInitHandler exceptionCaught");
        cause.printStackTrace();
        ctx.close();
    }

}
