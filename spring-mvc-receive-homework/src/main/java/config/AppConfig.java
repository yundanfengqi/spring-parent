package config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.logging.stdout.StdOutImpl;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @program: spring-mvc
 * @description:
 * @author: 云淡风轻
 * @create: 2019-11-12 11:03
 **/
@Configuration
@ComponentScan("com")
@MapperScan("com.dao")
@PropertySource("classpath:db.properties")
@ImportResource("classpath:applicationContext.xml")
@EnableTransactionManagement
public class AppConfig {
    @Value("${jdbc.url:jdbc:mysql://localhost:3306/homework}")private String url;
    @Value("${jdbc.username:root}")private String userName;
    @Value("${jdbc.password:root}")private String passWord;

    @Bean
    public DataSource dataSource(){
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUrl(url);
        druidDataSource.setUsername(userName);
        druidDataSource.setPassword(passWord);
        return druidDataSource;
    }

    @Bean
    public DataSourceTransactionManager dataSourceTransactionManager(){
        return new DataSourceTransactionManager(dataSource());
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource());
        sqlSessionFactoryBean.setConfiguration(configuration());
        PathMatchingResourcePatternResolver patternResolver = new PathMatchingResourcePatternResolver();
        sqlSessionFactoryBean.setMapperLocations(patternResolver.getResources("classpath*:com/dao/mapper/EmployeeMapper.xml"));
        return sqlSessionFactoryBean.getObject();
    }

    private org.apache.ibatis.session.Configuration configuration(){
        org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
        configuration.setLogImpl(StdOutImpl.class);
        return configuration;
    }
}
