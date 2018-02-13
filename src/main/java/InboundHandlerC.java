import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

public class InboundHandlerC extends ChannelInboundHandlerAdapter {
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        System.out.println("input C");
        ctx.fireChannelRead(msg);
    }
}
