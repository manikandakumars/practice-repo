package com.mani.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mani.dto.Claim;

@RestController
@RequestMapping("/claim")
public class ClaimResource {

	@GetMapping(path = "/{id}")
	public Claim getClaim(@PathVariable("id") String id) {
		
		Claim claim = new Claim();
		claim.setClaimId(id);
		claim.setProviderId("123");
		claim.setClaimType("Medical");
		claim.setClaimAmount("102.20");
		return claim;
	}
}
