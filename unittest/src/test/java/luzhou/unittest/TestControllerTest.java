package luzhou.unittest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@RunWith(SpringRunner.class)
@WebMvcTest
public class TestControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void testSayTest() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/Test")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(content().string("Enter this method"));
    }
}
