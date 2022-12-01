package com.example.demospringmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

//@Configuration @EnableAutoconfiguration (classpath class) @ComponetScan
//spring context(container)
//spring mvc
//GET:localhost:8080/xxx
//http request dispatchSevlet -> handlerMapping -> controller ->(model(data), view name) -> view resolver
//                                                             ->data -> messageConverter
/**
 * Spring MVC
 *      model
 *      view*
 *      controller
 *      RESTful raw
 */

/**
 * 1.requirment (data format,http method...)
 * 2. http method(
 *      get: search
 *      post: create new resouce
 *      put: update whole record
 *      patch: update partial record
 *      delete: ~
 *      head:
 * )
 *  idempotent (n =1 )
 * 3. url
 * 4. status code
 *    200... success
 *    300 redirect
 *    404... user error
 *    500... server error
 *5. request body/ path var/ response body/ request body
 */
@SpringBootApplication
public class DemoSpringMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringMvcApplication.class, args);
    }

}
