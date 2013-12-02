(ns mec
  (:import [com.drew.imaging ImageMetadataReader ImageProcessingException] 
           [com.drew.metadata Metadata Directory Tag]
           [com.drew.metadata.exif ExifSubIFDDirectory]))

(defn ^Metadata metadata
  [file-path]
  (-> (java.io.File. file-path)
      (ImageMetadataReader/readMetadata)))

(defn tags
  [^Directory directory]
  (reduce #(assoc % (.getTagName %2) (.getDescription %2))
          {}
          (.getTags directory)))

(defn parse
  [^Metadata metadata]
  (reduce #(assoc % (.getName %2) (tags %2))
          {} 
          (.getDirectories metadata)))

(defn ->string
  [metadata]
  (doseq [content (parse metadata)] 
    ;; TODO
    ))
