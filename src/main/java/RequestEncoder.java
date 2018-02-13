import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

public class RequestEncoder extends MessageToByteEncoder<Request> {
    protected void encode(ChannelHandlerContext channelHandlerContext, Request request, ByteBuf byteBuf) throws Exception {

    }
}
