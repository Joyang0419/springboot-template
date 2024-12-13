package web.controller;

import web.dto.HealthCheckDTO;
import web.dto.ResponseDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api")
public class HealthCheck {
    @GetMapping("/health")
    public ResponseDTO<HealthCheckDTO> healthCheck() {
        HealthCheckDTO healthCheckDTO = new HealthCheckDTO();
        healthCheckDTO.setMsg("I'm alive!");
        ResponseDTO<HealthCheckDTO> responseDTO = new ResponseDTO<>();
        responseDTO.setCode(200);
        responseDTO.setMessage("OK");
        responseDTO.setData(healthCheckDTO);
        return responseDTO;
    }
}