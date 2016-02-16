package com.zrh.socket.server.custom;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

import java.net.InetAddress;

public class CustomHandler extends SimpleChannelInboundHandler<String> {

	@Override
	protected void channelRead0(ChannelHandlerContext ctx, String msg)
			throws Exception {
		// TODO Auto-generated method stub
		//这里收到的msg是客户端发送过来的，包含了前面的长度字段
		System.out.println("From client[" + ctx.channel().remoteAddress() + "] message: " + msg);
	}

	@Override
	public void channelActive(ChannelHandlerContext ctx) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("RemoteAddress: " + ctx.channel().remoteAddress() + " active!");
		ctx.writeAndFlush("Welcome to " + InetAddress.getLocalHost().getHostName() + " service!");
		super.channelActive(ctx);
	}

}
