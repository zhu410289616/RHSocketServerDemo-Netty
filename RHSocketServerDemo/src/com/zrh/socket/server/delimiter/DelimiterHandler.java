package com.zrh.socket.server.delimiter;

import java.net.InetAddress;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class DelimiterHandler extends SimpleChannelInboundHandler<String> {

	@Override
	protected void channelRead0(ChannelHandlerContext ctx, String msg)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println(ctx.channel().remoteAddress() + " Say: " + msg);
		ctx.writeAndFlush("{\"key\":\"Received your message!\"}\n");
	}

	@Override
	public void channelActive(ChannelHandlerContext ctx) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("RemoteAddress: " + ctx.channel().remoteAddress() + " active!");
		ctx.writeAndFlush("{\"key\":\"Welcome to " + InetAddress.getLocalHost().getHostName() + " service!\"}\n");
		super.channelActive(ctx);
	}

}
