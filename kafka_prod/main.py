from kafka import KafkaProducer

producer = KafkaProducer(bootstrap_servers='localhost:9092')
producer.send('my-topic', b'Hello, World!')
#producer.send('sample', key=b'message-two', value=b'This is Kafka-Python')
