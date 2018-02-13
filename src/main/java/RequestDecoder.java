import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

import java.nio.charset.Charset;
import java.util.List;

public class RequestDecoder extends ByteToMessageDecoder {

    protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) {
        System.out.println("decode request");

        int length = in.readableBytes();

        ByteBuf buffer = in.readBytes(length);

        String message = buffer.toString(0, length, Charset.forName("UTF-8"));

        Request request = new Request();
        request.setMessage(message);



        out.add(request);
    }
}
