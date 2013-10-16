package org.nhnnext.repository;

import org.nhnnext.web.PhotoComment;
import org.springframework.data.repository.CrudRepository;

public interface CommentRepository extends CrudRepository<PhotoComment, Long>{

}
