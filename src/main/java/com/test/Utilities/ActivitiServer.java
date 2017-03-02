package com.test.Utilities;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.impl.cfg.StandaloneProcessEngineConfiguration;

/**
 * Created by KumarA6 on 02-02-2017.
 */
public class ActivitiServer {

    public static void startActiviti() {

        ProcessEngineConfiguration process = new StandaloneProcessEngineConfiguration();
        process.setJdbcDriver("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        process.setJdbcUrl("url");
        process.setJdbcUsername("user");
        process.setJdbcPassword("password");
        process.setDatabaseSchemaUpdate("true");
        ProcessEngine engine = process.buildProcessEngine();

        RepositoryService repositoryService = engine.getRepositoryService();
    }
}
