package com.zrh.socket.server.variable;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

public class VariableEncoder extends MessageToByteEncoder<String> {

	@Override
	protected void encode(ChannelHandlerContext paramChannelHandlerContext,
			String paramI, ByteBuf paramByteBuf) throws Exception {
		// TODO Auto-generated method stub
		String reply = paramI;
		short length = (short) reply.length();
		//前2个字节为包体长度
		paramByteBuf.writeShort(length);
		//包体的实际数据
		paramByteBuf.writeBytes(reply.getBytes());
	}

}
