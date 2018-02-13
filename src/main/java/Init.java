import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;

public class Init extends ChannelInitializer<SocketChannel> {
    protected void initChannel(SocketChannel ch) throws Exception {
        ChannelPipeline pipeline = ch.pipeline();
        pipeline.addLast(new InboundHandlerA());
        pipeline.addLast(new InboundHandlerB());
        pipeline.addLast(new InboundHandlerC());
        pipeline.addLast(new OutboundHandlerC());
        pipeline.addLast(new OutboundHandlerB());
        pipeline.addLast(new OutboundHandlerA());
    }
}
