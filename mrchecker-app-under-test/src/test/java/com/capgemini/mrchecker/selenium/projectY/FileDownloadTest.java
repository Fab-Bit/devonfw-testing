package com.capgemini.mrchecker.selenium.projectY;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.capgemini.mrchecker.core.groupTestCases.testSuites.tags.TestsChrome;
import com.capgemini.mrchecker.core.groupTestCases.testSuites.tags.TestsFirefox;
import com.capgemini.mrchecker.core.groupTestCases.testSuites.tags.TestsIE;
import com.capgemini.mrchecker.core.groupTestCases.testSuites.tags.TestsSelenium;
import com.capgemini.mrchecker.selenium.pages.projectY.FileDownloadPage;

@Category({ TestsSelenium.class, TestsChrome.class, TestsFirefox.class, TestsIE.class })
public class FileDownloadTest extends TheInternetBaseTest<FileDownloadPage> {
	
	private static FileDownloadPage fileDownloadPage;
	
	@BeforeClass
	public static void setUpBeforeClass() {
		fileDownloadPage = new FileDownloadPage();
		shouldTheInternetSubpageBeOpened(fileDownloadPage);
	}
	
	@Test
	public void shouldfileBeDownloaded() {
		
		logStep("Download the some-file.txt");
		File downloadedFile = fileDownloadPage.downloadTextFile();
		
		logStep("Verify if downloaded file exists");
		assertTrue("Downloaded file does not exist", downloadedFile.exists());
		
		logStep("Remove downloaded file");
		downloadedFile.delete();
		
		logStep("Verify if downloaded file has been removed");
		assertFalse("Downloaded file still exists", downloadedFile.exists());
	}
	
}