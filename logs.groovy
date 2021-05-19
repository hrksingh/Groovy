import groovy.util.logging.Log

@Log
class MainClass
{
   static void main(String[] args) {
        String message = 'Hello, user!'
        println message
        log.info(message)
    }
}
