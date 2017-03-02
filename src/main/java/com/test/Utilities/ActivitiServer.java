package com.test.Utilities;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.impl.cfg.StandaloneProcessEngineConfiguration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * Created by KumarA6 on 02-02-2017.
 */
@Configuration
public class ActivitiServer {

    @Value("${db.type}")
    private static String dbType;

    @Value("${db.url}")
    private static String dbURL;

    @Value("${db.user}")
    private static String dbUser;

    @Value("${db.password}")
    private static String dbPass;

    public static void startActiviti() {

        ProcessEngineConfiguration process = new StandaloneProcessEngineConfiguration();
        process.setJdbcDriver(dbType);
        process.setJdbcUrl(dbURL);
        process.setJdbcUsername(dbUser);
        process.setJdbcPassword(dbPass);
        process.setDatabaseSchemaUpdate("true");
        ProcessEngine engine = process.buildProcessEngine();

        RepositoryService repositoryService = engine.getRepositoryService();
    }
}
