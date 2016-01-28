package com.zrh.socket.server.delimiter;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

public class DelimiterServer {

	private static final int portNumber = 7878;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EventLoopGroup boosGroup = new NioEventLoopGroup();
		EventLoopGroup workerGroup = new NioEventLoopGroup();
		
		try {	
			ServerBootstrap b = new ServerBootstrap();
			b.group(boosGroup, workerGroup);
			b.channel(NioServerSocketChannel.class);
			b.childHandler(new DelimiterInitializer());
			
			ChannelFuture f = b.bind(portNumber).sync();
			f.channel().closeFuture().sync();
			
			// 可以简写为
            /* b.bind(portNumber).sync().channel().closeFuture().sync(); */
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			boosGroup.shutdownGracefully();
			workerGroup.shutdownGracefully();
		}
		
	}

}
