package com.zrh.socket.server.custom;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

public class CustomEncoder extends MessageToByteEncoder<String> {

	@Override
	protected void encode(ChannelHandlerContext paramChannelHandlerContext,
			String paramI, ByteBuf paramByteBuf) throws Exception {
		// TODO Auto-generated method stub
		String reply = paramI;
		short length = (short) reply.length();
		//前2个字节为包体长度
		paramByteBuf.writeShort(length);
		//手动写死的请求唯一id
		paramByteBuf.writeInt(999);
		//包体的实际数据
		paramByteBuf.writeBytes(reply.getBytes());
	}

}
