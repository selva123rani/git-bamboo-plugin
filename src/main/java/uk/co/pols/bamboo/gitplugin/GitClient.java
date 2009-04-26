package uk.co.pols.bamboo.gitplugin;

import com.atlassian.bamboo.build.logger.BuildLogger;
import com.atlassian.bamboo.repository.RepositoryException;
import com.atlassian.bamboo.commit.Commit;

import java.io.File;
import java.util.List;

public interface GitClient {
    String initialiseRepository(File sourceCodeDirectory, String planKey, String vcsRevisionKey, GitRepositoryConfig gitRepositoryConfig, boolean workspaceEmpty, BuildLogger buildLogger) throws RepositoryException;

    String getLatestUpdate(BuildLogger buildLogger, String repositoryUrl, String planKey, String lastRevisionChecked, List<Commit> commits, File sourceCodeDirectory) throws RepositoryException;
}