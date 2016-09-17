class Edge < ActiveRecord::Base
  has_one :start_node, class_name: 'Node'
  has_one :end_node, class_name: 'Node'
  belongs_to :graph

  validates :start_node_id, :end_node_id, :distance, :graph_id, presence: true
end
