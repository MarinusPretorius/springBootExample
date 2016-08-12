package com.myapp.resource;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.domain.person;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/test")
@Api(value = "Person")
public class myResource {
	@ApiOperation(value = "Find Person")
	@RequestMapping(method= RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public person home() {
		com.myapp.domain.person person = new person();
		person.setName("Marinus");
		person.setSurname("Pretorius");
        return person;
    }

}
