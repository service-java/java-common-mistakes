package org.geekbang.time.commonmistakes.ch26_nosqluse.esvsmyql;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsESRepository extends ElasticsearchRepository<News, Long> {
    long countByCateidAndContentContainingAndContentContaining(int cateid, String keyword1, String keyword2);
}
