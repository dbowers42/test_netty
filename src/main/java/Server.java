import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelOption;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;


public class Server {
    public static void main(String[] args) {
        NioEventLoopGroup workerGroup = new NioEventLoopGroup();
        ServerBootstrap bootstrap = new ServerBootstrap();
        bootstrap.group(workerGroup).channel(NioServerSocketChannel.class);


        bootstrap.childHandler(new Init());

        bootstrap.childOption(ChannelOption.SO_KEEPALIVE, true);
        try {
            bootstrap.bind("127.0.0.1", 8080).sync();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
