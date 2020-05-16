import com.rabbitmq.client.AMQP.BasicProperties;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.DefaultConsumer;
import com.rabbitmq.client.Envelope;

public class MyConsumer extends DefaultConsumer {

    public MyConsumer(Channel channel) {
        super(channel);        
    }

    public void handleDelivery(String consumerTag,
            Envelope envelope,
            BasicProperties properties, byte[] body) throws java.io.IOException {

        /// byte[] body = body Message
        /// here you have your message

        getChannel().basicAck(envelope.getDeliveryTag(), false);
    }


}