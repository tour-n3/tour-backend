package com.sevenhallo.tourbackend.controller;

import ch.qos.logback.core.joran.util.beans.BeanUtil;
import com.sevenhallo.tourbackend.controller.CustomUtils;
import com.sevenhallo.tourbackend.controller.TourController;
import com.sevenhallo.tourbackend.dto.TourDto;
import com.sevenhallo.tourbackend.entity.Tour;
import com.sevenhallo.tourbackend.mapper.TourMapper;
import com.sevenhallo.tourbackend.service.TourService;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.Collections;

@Transactional
public class TourControllerTest {
    private static final String ENDPOINT_URL = "/api/tour";

    @InjectMocks
    private TourController tourController;

    @Mock
    private TourService tourService;

    private MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders
                .standaloneSetup(tourController)
                .build();
    }

    @Test
    public void findAllByPage() throws Exception {
        Page<TourDto> page = new PageImpl<>(Collections.singletonList(TourBuilder.getDto()));

        Mockito.when(tourService.findByCondition(ArgumentMatchers.any(), ArgumentMatchers.any()))
                .thenReturn(page);

        ResultActions resultActions = mockMvc.perform(MockMvcRequestBuilders.get(ENDPOINT_URL)
                        .accept(MediaType.APPLICATION_JSON))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.data.content", Matchers.hasSize(1)));

        Mockito.verify(tourService, Mockito.times(1)).findByCondition(ArgumentMatchers.any(), ArgumentMatchers.any());
        Mockito.verifyNoMoreInteractions(tourService);
    }

    @Test
    public void getById() throws Exception {
        Mockito.when(tourService.findById(ArgumentMatchers.anyLong()))
                .thenReturn(TourBuilder.getDto());

        mockMvc.perform(MockMvcRequestBuilders.get(ENDPOINT_URL + "/1"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content()
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.jsonPath("$.id", Is.is(1)));

        Mockito.verify(tourService, Mockito.times(1)).findById("1");
        Mockito.verifyNoMoreInteractions(tourService);
    }

    @Test
    public void save() throws Exception {
        Mockito.when(tourService.save(ArgumentMatchers.any(TourDto.class)))
                .thenReturn(TourBuilder.getDto());

        mockMvc.perform(
                        MockMvcRequestBuilders.post(ENDPOINT_URL)
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(CustomUtils.asJsonString(TourBuilder.getDto())))
                .andExpect(MockMvcResultMatchers.status().isCreated());

        Mockito.verify(tourService, Mockito.times(1)).save(ArgumentMatchers.any(TourDto.class));
        Mockito.verifyNoMoreInteractions(tourService);
    }

    @Test
    public void update() throws Exception {
        Mockito.when(tourService.update(ArgumentMatchers.any(), ArgumentMatchers.anyLong()))
                .thenReturn(TourBuilder.getDto());

        mockMvc.perform(
                        MockMvcRequestBuilders.put(ENDPOINT_URL + "/1")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(CustomUtils.asJsonString(TourBuilder.getDto())))
                .andExpect(MockMvcResultMatchers.status().isOk());

        Mockito.verify(tourService, Mockito.times(1))
                .update(ArgumentMatchers.any(TourDto.class), ArgumentMatchers.anyLong());
        Mockito.verifyNoMoreInteractions(tourService);
    }

    @Test
    public void delete() throws Exception {
        Mockito.doNothing().when(tourService).deleteById(ArgumentMatchers.anyLong());

        mockMvc.perform(
                        MockMvcRequestBuilders.delete(ENDPOINT_URL + "/1")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(CustomUtils.asJsonString(TourBuilder.getIds())))
                .andExpect(MockMvcResultMatchers.status().isOk());

        Mockito.verify(tourService, Mockito.times(1))
                .deleteById(Mockito.anyLong());
        Mockito.verifyNoMoreInteractions(tourService);
    }
}
