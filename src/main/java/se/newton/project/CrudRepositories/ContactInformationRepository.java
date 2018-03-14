package se.newton.project.CrudRepositories;

import org.springframework.data.repository.CrudRepository;

import se.newton.project.DBModels.ContactInformation;

public interface ContactInformationRepository extends CrudRepository<ContactInformation, Long> {

}
