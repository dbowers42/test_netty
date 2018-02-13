import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;

public class Init extends ChannelInitializer<SocketChannel> {
    protected void initChannel(SocketChannel ch) throws Exception {
        ChannelPipeline pipeline = ch.pipeline();
        pipeline.addLast("1", new RequestDecoder());
        pipeline.addLast("2", new ResponseEncoder());
        pipeline.addLast("3", new OutboundHandlerC());
        pipeline.addLast("4", new OutboundHandlerB());
        pipeline.addLast("5", new InboundHandlerA());


    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        super.exceptionCaught(ctx, cause);
    }
}
