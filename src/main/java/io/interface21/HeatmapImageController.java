package io.interface21;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class HeatmapImageController {

    @ResponseBody
    @RequestMapping(path = "/heatmap", method = RequestMethod.GET, produces = MediaType.IMAGE_JPEG_VALUE)
    public byte[] heatmap(@RequestParam(name = "user") String userToken,
                          @RequestParam(name = "x", required = false, defaultValue = "320") Integer sizeX,
                          @RequestParam(name = "y", required = false, defaultValue = "240") Integer sizeY) {
        return null;
    }
}
