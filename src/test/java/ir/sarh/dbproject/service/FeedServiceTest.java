package in.nimbo.rssreader.service;

import org.junit.Before;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;

public class FeedServiceTest {
    @Mock
    Logger log;
    @InjectMocks
    FeedService feedService;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

//    @Test
//    public void testGetFeeds() throws Exception {
//        List<News> result = feedService.getFeeds("rssUrl");
//        Assert.assertEquals(Arrays.<News>asList(new News("title", "description", "newsAgency", "category", "date", "source", "rssUrl")), result);
//    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme