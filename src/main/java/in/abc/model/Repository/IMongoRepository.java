package in.abc.model.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import in.abc.model.Patient;

public interface IMongoRepository extends MongoRepository<Patient, Integer>{
	
}
