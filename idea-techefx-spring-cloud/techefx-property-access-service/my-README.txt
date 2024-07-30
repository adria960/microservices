
@Component
@ConfigurationProperties(prefix="property-file")
public class PropertyAccessBean

Prefix: property-file
Check all the keys with  property-file

property-file.name=DEFAULT
property-file.description=DEFAULT Environment Value !!

spring:
  application:
    name: techefx-property-access-service
  profiles:
    active: qa

PROFILE DEFINED THERE - profiles!

Start both config and this service:
Log from this:
/\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.3.6.RELEASE)

2023-05-15 23:09:07.988  INFO 19888 --- [  restartedMain] c.c.c.ConfigServicePropertySourceLocator : Fetching config from server at : http://localhost:8888
2023-05-15 23:09:11.935  INFO 19888 --- [  restartedMain] c.c.c.ConfigServicePropertySourceLocator : Located environment: name=techefx-property-access-service, profiles=[default], label=null, version=5849e8207dd09dfdc31a137d212a7ac4439c1b5f, state=null
2023-05-15 23:09:11.936  INFO 19888 --- [  restartedMain] b.c.PropertySourceBootstrapConfiguration : Located property source: [BootstrapPropertySource {name='bootstrapProperties-configClient'}, BootstrapPropertySource {name='bootstrapProperties-https://github.com/techefx/environment-variable-repo.git/techefx-property-access-service.properties'}]
2023-05-15 23:09:11.954  INFO 19888 --- [  restartedMain] .TechefxPropertyAccessServiceApplication : The following profiles are active: qa
2023-05-15 23:09:13.366  INFO 19888 --- [  restartedMain] o.s.cloud.context.scope.GenericScope     : BeanFactory id=4aead7af-8af5-3aa4-8267-c651f072d826
2023-05-15 23:09:14.870  INFO 19888 --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8100 (http)
2023-05-15 23:09:14.892  INFO 19888 --- [  restartedMain] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2023-05-15 23:09:14.892  INFO 19888 --- [  restartedMain] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.39]
2023-05-15 23:09:15.036  INFO 19888 --- [  restartedMain] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2023-05-15 23:09:15.037  INFO 19888 --- [  restartedMain] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 3031 ms
2023-05-15 23:09:15.586  INFO 19888 --- [  restartedMain] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'applicationTaskExecutor'
2023-05-15 23:09:16.022  INFO 19888 --- [  restartedMain] o.s.b.d.a.OptionalLiveReloadServer       : LiveReload server is running on port 35729
2023-05-15 23:09:17.041  INFO 19888 --- [  restartedMain] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 1 endpoint(s) beneath base path '/actuator'
2023-05-15 23:09:17.140  INFO 19888 --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8100 (http) with context path ''
2023-05-15 23:09:18.117  INFO 19888 --- [  restartedMain] .TechefxPropertyAccessServiceApplication : Started TechefxPropertyAccessServiceApplication in 13.771 seconds (JVM running for 14.841)



POSTMAN
GET
localhost:8100/access/accessPropertyFile
{
    "name": "Dev",
    "description": "Dev Environment Value !"
}