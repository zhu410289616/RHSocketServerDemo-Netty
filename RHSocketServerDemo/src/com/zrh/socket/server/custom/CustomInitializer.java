package com.zrh.socket.server.custom;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;
import io.netty.handler.codec.string.StringDecoder;

public class CustomInitializer extends ChannelInitializer<SocketChannel> {

	@Override
	protected void initChannel(SocketChannel ch) throws Exception {
		// TODO Auto-generated method stub
		
		ChannelPipeline pipeline = ch.pipeline();
		
		pipeline.addLast("frameDecoder", new LengthFieldBasedFrameDecoder(65536, 0, 2));
		
		pipeline.addLast("dataDecoder", new StringDecoder());
		pipeline.addLast("encoder", new CustomEncoder());
		
		pipeline.addLast("handler", new CustomHandler());
		
	}

}
