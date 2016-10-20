// package io.salon.web;
//
// import io.salon.repositories.AddonRepository;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.transaction.annotation.Transactional;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
// import org.springframework.web.bind.annotation.RestController;
//
// @RestController
// public class EveryResourceController {
// 	private final AddonRepository addonRepository;
//
// 	@Autowired
// 	EveryResourceController(AddonRepository addonRepository) {
// 		this.addonRepository = addonRepository;
// 	}
//
// 	  @Transactional
// 	    @RequestMapping(method = RequestMethod.DELETE, value = "/all")
// 	    void delete() {
// 	        addonRepository.deleteAll();
// 	    }
// }
