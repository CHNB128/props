(ns props.core)

(defonce ^:private props (System/getProperties))

(defn prop
  ([prop-name]
   (prop prop-name nil))
  ([prop-name by-default]
   (let [p (get props prop-name by-default)]
     (when-not p
       (throw (Exception. (str "Property" prop-name "not set!"))))
     (identity p))))