package uk.ac.ebi.subs.linkresolution;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.client.RestTemplate;
import uk.ac.ebi.subs.Application;
import uk.ac.ebi.subs.data.component.SubsLink;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
@IntegrationTest({"server.port=0"})
public class LinkResolutionControllerIntegrationTest {

    @Value("${local.server.port}")
    private int port;

    private RemoteLinkResolutionServiceImpl remoteLinkResolutionService;
    private SubsLink subsLink;

    @Before
    public void setUp() throws Exception {
        this.subsLink = new SubsLink();
        this.subsLink.setUuid("f3dc49d4-12eb-4993-9ce2-d8cdf6ae7592");
        this.subsLink.setAccession("A1");
        this.subsLink.setArchive("A test archive");

        this.remoteLinkResolutionService = new RemoteLinkResolutionServiceImpl();
        this.remoteLinkResolutionService.setBase(new URL("http://localhost:" + port + "/link"));
        this.remoteLinkResolutionService.setRestTemplate(new TestRestTemplate());
    }

    @Test
    public void getUuid() throws Exception {
        remoteLinkResolutionService.storeSubsLink(this.subsLink);

        SubsLink expectedSubsLink = this.subsLink;

        SubsLink actualSubsLink = this.remoteLinkResolutionService.fetchSubsLink(expectedSubsLink.getUuid());

        assertThat(actualSubsLink.getUuid(), equalTo(expectedSubsLink.getUuid()));
        assertThat(actualSubsLink.getAccession(), equalTo(expectedSubsLink.getAccession()));
        assertThat(actualSubsLink.getArchive(), equalTo(expectedSubsLink.getArchive()));
    }

}