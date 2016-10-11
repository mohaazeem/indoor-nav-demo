class Node < ActiveRecord::Base
  belongs_to :graph

  validates :label, :x, :y, :type, :graph_id, presence: true
end
