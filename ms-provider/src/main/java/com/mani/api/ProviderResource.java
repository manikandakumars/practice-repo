package com.mani.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mani.dto.Provider;

@RestController
@RequestMapping("/provider")
public class ProviderResource {

	@GetMapping(path = "/{id}")
	public Provider getProvider(@PathVariable("id") String id) {
		Provider provider = new Provider();
		provider.setProviderId(id);
		provider.setProviderName("Mani");
		provider.setProviderSpecialty("Ortho");
		
		return provider;
		
	}
}
