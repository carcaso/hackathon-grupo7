package org.academiadecodigo.hackathon.help7hearts.controllers.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class RestIndexController {

    @RequestMapping(method = RequestMethod.GET, path = "/")
    protected ResponseEntity<ApiVersion> showVersion() {

        ApiVersion version = new ApiVersion();
        version.setName("Help API");
        version.setVersion("v0.1");

        return new ResponseEntity<>(version, HttpStatus.OK);
    }

    private static class ApiVersion {

        private String name;
        private String version;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }
    }
}
